A repository showing how you can wrap other plugins and apply them as a plugin to your build. This
uses a [composite build](https://docs.gradle.org/current/userguide/composite_builds.html).

[Blog post write up is here.](https://blog.blundellapps.co.uk/applying-a-3rd-party-gradle-plugin-as-a-composite-plugin/)

The code is split across two branches:

1) Applying a 3rd party plugin directly

- Branch
  name: [tree/affected-module-detector-applied-as-normal](https://github.com/blundell/gradle-composite-plugin/tree/affected-module-detector-applied-as-normal)
- The 3rd party plugin is configured
  here: [build.gradle#L12-L18](https://github.com/blundell/gradle-composite-plugin/blob/affected-module-detector-applied-as-normal/build.gradle#L12-L18)

2) Wrapping a 3rd party plugin in a composite plugin to include

- Branch
  name: [tree/affected-module-detector-applied-as-composite](https://github.com/blundell/gradle-composite-plugin/tree/affected-module-detector-applied-as-composite)
- The 3rd party plugin is configured
  here: [BlundellAffectedModulesPlugin.kt#L12-L16](https://github.com/blundell/gradle-composite-plugin/blob/affected-module-detector-applied-as-composite/amd-plugin/plugin/src/main/kotlin/com/blundell/amd/BlundellAffectedModulesPlugin.kt#L12-L16)
