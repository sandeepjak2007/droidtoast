# Simple Android Toast Library (Droid Toast 🚀)

Welcome to the Simple Android Toast Library!

## Installation

Add the following dependency to your app's `build.gradle` file:

```gradle
implementation 'com.github.sandeepjak2007:droidtoast:1.0.2'
```
Add the following dependency to your main `build.gradle` file:

```maingradle
 maven { url 'https://jitpack.io' }
```

## Implementation
Kotlin:
```Show Toast
DroidToast.showToast(this, "Simple Failure Message from sample library", status = DroidToast.FAILURE)
DroidToast.showToast(this, "Simple Success Message from sample library", status = DroidToast.SUCCESS)
DroidToast.showToast(this, "Simple Warning Message from sample library", status = DroidToast.WARNING)
```
Java:
``` Show Toast
DroidToast.INSTANCE.showToast(this, "Simple Failure Message from sample library", null, DroidToast.FAILURE);
DroidToast.INSTANCE.showToast(this, "Simple Success Message from sample library", null, DroidToast.SUCCESS);
DroidToast.INSTANCE.showToast(this, "Simple Warning Message from sample library", null, DroidToast.WARNING);
```
Kotlin:

![image](https://github.com/sandeepjak2007/droidtoast/assets/16497904/8d87c235-deaa-4bcb-9b6f-13a25db179ae)

Java:

![image](https://github.com/sandeepjak2007/droidtoast/assets/16497904/3d566dc8-edac-4467-8d74-10db9f9d885f)

## Screenshots

Success 👍:

![DroidToastFailure](https://github.com/sandeepjak2007/droidtoast/assets/16497904/c343cd3d-5d69-488f-84b6-3f429ad6c911)

Failure 😣:

![DroidToastSuccess](https://github.com/sandeepjak2007/droidtoast/assets/16497904/33dad674-05b6-48b0-9cc3-e819c798b7c0)

Warning 🤔:

![DroidToastWarning](https://github.com/sandeepjak2007/droidtoast/assets/16497904/ef2f594f-cd94-4c3d-9c2a-897fd474591d)
