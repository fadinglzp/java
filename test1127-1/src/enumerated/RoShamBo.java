package enumerated;

import static lzp.tools.*;
import lzp.*;
import static enumerated.Outcome.*;

interface Competitor<T extends Competitor<T>> {
	Outcome compete(T competitor);
}

public class RoShamBo {
	public static <T extends Enum<T> & Competitor<T>> void match(T a, T b) {
		// print(a + " vs. " + b + ": " + a.compete(b));
		print(String.format("%-10svs.%10s   :  %s", a, b, a.compete(b)));
	}

	public static <T extends Enum<T> & Competitor<T>> void play(Class<T> rsbClass, int size) {
		for (int i = 0; i < size; i++)
			match(Enums.random(rsbClass), Enums.random(rsbClass));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoShamBo.play(RoShamBo6.class, 20);
	}

}

enum RoShamBo3 implements Competitor<RoShamBo3> {
	PAPER {
		public Outcome compete(RoShamBo3 it) {
			switch (it) {
			default:
			case PAPER:
				return DRAW;
			case SCISSORS:
				return LOSE;
			case ROCK:
				return WIN;
			}
		}
	},
	SCISSORS {
		public Outcome compete(RoShamBo3 it) {
			switch (it) {
			default:
			case PAPER:
				return WIN;
			case SCISSORS:
				return DRAW;
			case ROCK:
				return LOSE;
			}
		}
	},
	ROCK {
		public Outcome compete(RoShamBo3 it) {
			switch (it) {
			default:
			case PAPER:
				return LOSE;
			case SCISSORS:
				return WIN;
			case ROCK:
				return DRAW;
			}
		}
	};
	public abstract Outcome compete(RoShamBo3 it);

}

enum RoShamBo4 implements Competitor<RoShamBo4> {
	ROCK {
		public Outcome compete(RoShamBo4 opponent) {
			return compete(SCISSORS, opponent);
		}
	},
	SCISSORS {
		public Outcome compete(RoShamBo4 opponent) {
			return compete(PAPER, opponent);
		}
	},
	PAPER {
		public Outcome compete(RoShamBo4 opponent) {
			return compete(ROCK, opponent);
		}
	};
	Outcome compete(RoShamBo4 loser, RoShamBo4 opponent) {
		return opponent == this ? DRAW : opponent == loser ? WIN : LOSE;
	}
}

enum RoShamBo6 implements Competitor<RoShamBo6> {
	PAPER, SCISSORS, ROCK;
	private static Outcome[][] table = { { DRAW, LOSE, WIN }, { WIN, DRAW, LOSE }, { LOSE, WIN, DRAW }, };

	public Outcome compete(RoShamBo6 other) {
		return table[this.ordinal()][other.ordinal()];
	}

}
