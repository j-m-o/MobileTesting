# 🤖 Amazon Adventure with Appium 🚀

This project showcases Appium's prowess in automating Android interactions, specifically conquering the mighty Amazon website! 🛒

### What it Does ✨

1. Opens Chrome on your Android device/emulator. 📱
2. Braves the wilds of the internet to reach Amazon.com. 🌐
3. Makes sure it's *actually* on Amazon (wouldn't want to get lost!). ✅
4. Hunts for the elusive "amazon warehouse deals today". 🔍
5. Courageously clicks on the first search result. 🎯
6. Adds the treasure to the cart! 💰
7. Boldly proceeds to checkout (well, starts the process at least...). 💳

### How to Run it 🛠️

**Prerequisites:**

* Appium: Make sure you have Appium installed and set up.
* Java: Ensure you have Java Development Kit (JDK) installed.
* ChromeDriver: Download the ChromeDriver compatible with your Chrome browser version.

**Building and Running**:

1. Clone the repository: 
   git clone https://your-repository-url.git

2. Navigate to the project directory:
   cd MobileTesting

3. Build the project:

   * Using Maven:
     mvn clean install

   * Using Gradle:
     gradle clean build

4. Run the tests:

   * Using Maven:
     mvn test 

   * Using Gradle:
     gradle test

### Additional Notes 📝

* Update the 'chromedriverExecutable' capability in 'AmazonTest.java' with the correct path to your ChromeDriver.
* Double-check element locators in the code, as Amazon's website structure might change.
* Consider adding more test cases and handling dynamic elements for robustness.

## Bonus Side Quests 👾

1. Applitools Hello World 👋:  If you're curious about visual testing and Applitools, take a peek at `AppiumWebAndroidHelloWorldTest.java`. It demonstrates how to automate interactions with the Applitools Hello World demo page! 

2. Parallel Power-Up: Calculator Conundrum 🧮: Want to see Appium handle multiple devices at once? `AppiumNativeAndroidParallelCalcTest.java` is your ticket! It puts the Android calculator app through its paces, running tests in parallel on multiple emulators or devices. 

3. Messaging App Mayhem 💬: `FirstAppiumTest.java` demonstrates how to automate interactions with the Android messaging app!

4. Calculator Capers 📱: `AppiumNativeAndroidMessagesTest.java` takes on the built-in Android calculator app, showcasing basic arithmetic operations.

### Disclaimer ⚠️

* This is a simplified adventure. Real-world Amazon is full of pop-ups and surprises! 😲
* You might need to tweak things to fit your specific quest. 🧙‍♂️
* Most importantly, have fun exploring the world of Appium! 🎉
  

✨Guru of Qualitea aka Jessica 🧙🏽‍♀️ 
