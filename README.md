A repository showing how you can wrap other plugins and apply them as a plugin to your build.
This uses a (composite build)[https://docs.gradle.org/current/userguide/composite_builds.html].

The code is split across two branches:

- Applying a 3rd party plugin directly 
  - https://github.com/blundell/gradle-composite-plugin/tree/affected-module-detector-applied-as-normal
- Wrapping a 3rd party plugin in a composite plugin to include
  - https://github.com/blundell/gradle-composite-plugin/tree/affected-module-detector-applied-as-composite