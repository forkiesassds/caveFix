# CaveFix
A mod for Minecraft 1.7.10 that fixes caves and ravines to how it was back in 1.6.

## Installation
Download the mod (if available) and put it in your mods folder. Make sure you have a Mixin distribution that has GTNHMixins installed.

## Compilation
1. Clone the repository
2. Make sure you have a JDK installed.
3. Run `./gradlew build`
4. The mod should be built in `build/libs`

## Was this intended for GT:NH?
No. This mod was made after I have discovered that ravine generation was actually broken in 1.7 due to Mojang's effort to make terrain generate up to 256 blocks. This mod fixes that alongside increasing cave density to how to it was in 1.6.

I'm simply using their mod development toolkit to be able to make this mod using modern tools.
