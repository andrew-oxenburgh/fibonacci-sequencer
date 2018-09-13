# Fibonacci Calculator

## Explanation

I did the Android tutorial, https://codelabs.developers.google.com/codelabs/build-your-first-android-app-kotlin which gave me a framework in which to build my sequencer. It has a counter, so the UI and wiring were done by the time I finished.

## Documentation

in `.\doc` dir. Email, and image.

## Work arounds

**reset on rotate** - This is probably against Android guidelines, and it's clear I've done to avoid saving state.

I used https://www.gitignore.io/api/osx,intellij+all,androidstudio,windows to create the `.gitignore` file.

## Number Overflow

Notifies on Number Overflow, and will cease to calculate.

## To do (Nice to haves)

- **tests** - there is a framework setup for that.
- pull **business logic** out of `MainActivity.kt`. This should be in a separate file, and possibly a separate folder.
- Nice to use a **generator** for next in sequence.
- **saving state** - when you restart, or rotate, or probably even sleep, you lose state, and the counter restarts. The `ViewModel` allows you to save state across config changes.
- **not overflow** - use java `BigInteger` to calculate bigger numbers.
