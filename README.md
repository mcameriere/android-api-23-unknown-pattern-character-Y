# android-api-23-unknown-pattern-character-Y
SimpleDateFormat("Y") throws an exception on API 23 and below

From [https://developer.android.com/reference/java/text/SimpleDateFormat](https://developer.android.com/reference/java/text/SimpleDateFormat):

Letter | Date or Time Component | Supported (API Levels)
--- | --- | ---
y | Year | 1+
Y | Week year | 24+

The following code

    SimpleDateFormat formatter = new SimpleDateFormat("Y");

will throw an IllegalArgumentException on API 23 and below !

Most of the time, you don't want the weak year. You want the year! Use 'y' instead of 'Y'.

- Start a new Android Studio project
- Empty Activity
- Next
- Name: Unknown Pattern Character Y
- Package name: com.example.unknownpatterncharactery
- Minimum API level: API 21: Android 5.0 (Lollipop)
- Finish
- Replace the content of **ExampleUnitTest.java**
- Replace the content of **activity_main.xml**
- Replace the content of **MainActivity.java**
- Run the app on AVD API 23 or below
- Run the app on AVD API 24 or above
