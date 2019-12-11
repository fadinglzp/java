package io;

import java.util.prefs.*;
import static lzp.tools.*;

public class PreferencesDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Preferences prefs = Preferences.userNodeForPackage(PreferencesDemo.class);
		prefs.put("Location", "Oz");
		prefs.put("Footwear", "Ruby Slippers");
		prefs.putInt("Companions", 4);
		prefs.putBoolean("Are there witches?", true);
		int usageCount = prefs.getInt("UsageCount", 0);
		print(usageCount);
		usageCount++;
		prefs.putInt("UsageCount", usageCount);
		for (String key : prefs.keys())
			print(key + ": " + prefs.get(key, null));
		print("How many companions does Dorothy have? " + prefs.getInt("Companions", 0));

	}

}
