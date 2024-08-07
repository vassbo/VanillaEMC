![](https://github.com/user-attachments/assets/9835fc9c-b987-464f-9efa-4e4418aaa884 "VanillaEMC Banner")

# VanillaEMC

_VanillaEMC is a Minecraft Fabric mod that adds the ability to convert items into any other stored items based on its value (EMC)._

## Version

Currently working on Minecraft 1.21!

Becuase this is Fabric you will also need the "Fabric API"!

## Inspiration

This mod is inspired by the Transmutation table from ProjectE, I could not find any simular mods for newer versions of Minecraft, so I decided to try and make my own. :)

# How does it work?

Each item will be a unique EMC value, some have a fixed value, but most of the values are dynamically added based on the crafting recipe, meaning other mod items might also have EMC values.

Here is an example:
Dirt has the EMC value 1, and a Diamond has the value 4200, so you will need 4200 Dirt to get one Diamond, but you can also convert the other way.

### The Dissolver:

The main block of this mod is called "Dissolver" because it _dissolves_ the items, to begin with there will be no items stored in its database, but when you add items into this block it will remember it for later & also add the EMC value. It works almost like an Ender Chest because the data is the same anywhere in the world, but the data is also shared with other players unless you turn on [Private mode](#mod-config). It can be broken with a stone pickaxe or better.

### The Crystal Frame:

The other block of this mod is called "Crystal Frame", it's used to craft the Dissolver, but you can also use it to remotely access the Dissolver inventory if you are within 40 blocks of one.

# Screenshots

![screenshot](https://github.com/user-attachments/assets/0b8f8a95-8055-40d2-8ad9-5cf9c53b6670)
![screenshot](https://github.com/user-attachments/assets/072a2b1d-295a-4e21-b2a6-cca662b9d566)

# Crafting

Here's how you craft the "Crystal Frame":

![screenshot](https://github.com/user-attachments/assets/0ccd233b-a0da-48c4-9240-94d91928bde3)

And here's how the default recipe for the "Dissolver" is, it has a Nether Star because this can be a very OP item:

![screenshot](https://github.com/user-attachments/assets/4f69aa45-3ab4-409b-87af-609f0a77045b)

But if you don't want that recipe you can tweak the recipe difficulty in the [Mod Confg](#mod-config), here's "normal" difficulty:

![screenshot](https://github.com/user-attachments/assets/f361c060-cccd-4e89-be62-cf1e469ced4b)

And here's "easy" difficulty (useful for skyblock):

![screenshot](https://github.com/user-attachments/assets/d62ae645-e47f-480e-b800-ca9c4df64ba6)

# Mod Config

-   `emc_on_hud=*false*|true`: Display current EMC on HUD (top left corner)
-   `private_emc=*false*|true`: Should each player have their own EMC storage?
-   `creative_items=*false*|true`: Should creative items have EMC?
-   `difficulty=easy|normal|*hard*`: Changes crafting recipe for Dissolver block.
-   `mode=*default*|skyblock`: Changes some EMC values.

# Mod Commands

-   `/emc`: Get player EMC
-   `/emc list`: List all players & their EMC
-   `/emc give ({player})`: Give EMC to a player
-   `/emc take ({player})`: Take EMC from a player
-   `/emc set ({player})`: Set EMC for a player

-   `/emcmemory fill`: Store all items in the Dissolver!
-   `/emcmemory clear`: Forget all items stored in the Dissolver!
-   `/emcmemory add {item}`: Store a specific item in the Dissolver!
-   `/emcmemory remove {item}`: Remove a specific item from the Dissolver!

-   `/opendissolver`: Open the Dissolver screen if a block is within 40 blocks.

# License

VanillaEMC is licensed under the CC0-1.0 license. Read [more here](https://github.com/vassbo/VanillaEMC/blob/main/LICENSE).
