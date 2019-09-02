# android-api-23-unknown-pattern-character-Y
SimpleDateFormat("Y") throws an exception on API 23 and below

Letter | Date or Time Component | Supported (API Levels)
--- | --- | ---
y | Year | 1+
Y | Week year | 24+

The following code

    SimpleDateFormat formatter = new SimpleDateFormat("Y");

will throw an IllegalArgumentException on API 23 and below !
