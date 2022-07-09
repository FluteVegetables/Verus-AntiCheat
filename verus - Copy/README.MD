# Verus Anticheat

Decided to put this out here. Make sure to get as many people as possible to fork the repository as the verus devs will strike these. 
Please note there are a lot of checks and stuff missing, if anyone has any stuff to add please add it. Also some things in here may be outdated...
fv#4060 if anyone wants to contact me.
Also can't remove the "Verus-Copy" file because github won't let me lol

# Why Verus is a scam
Info from dort's verus leak on github.

## Infrequent Updates
- Verus lacks updates, severely. When it does update, critical issues are not fixed, exploits are not patched, and the plugin is as bad as ever. Verus has gotten 1 update in 2022 (as of writing this) and looking through the update history, there are maximum of 2 - 3 updates a year.

## Poorly Written Checks
- Verus combat checks while they may seem good at first glance are severely flawed and can be disabled in 5+ different methods. Some being as short as 1 line of code. The movement checks also are flawed and exempt in so many scenarios which is the source of countless disablers and exploits. Other verus checks are useless, way too specific (thus being easy to avoid), or just horribly written in general. Frequently, client developers are able to find blazing fast flies, disablers, speeds, and FastBows just minutes after updates are released. These are not typically patched, as the Verus developers have absolutely no idea what they are doing in terms of AntiCheat development. If you're here to paste some of Verus's code, you'll be subject to the same issues they have (hi itsNature).

## Misleading Information & Lies
- In their MCM thread, they claim to offer "Priority support via discord and/or telegram". This is completely untrue, as one of the most common complains on the MC-Market thread is the total lack of support.
- "Secure access to our authentication servers" proceeds to literally get cracked in 10 minutes, then deobfuscated, then source leaked
- "Maximum performance, handle thousands of players on a single instance with absolutely no overhead" - Verus performance isn't too special I would say. It might be a little better than other AntiCheats due to how weak the checks are.
- "Compatability, support clients and servers on versions 1.7x-1.16x". Verus devs can't seem to figure out what versions are supported because in this image: https://imgur.com/a/QYIKVzz, it states the version support is only 1.7 - 1.12.2. If you check through the code in this repository, you will see it does not seem to support 1.9, 1.10, or 1.13.
- "Informative and useful GUI, control checks and much more" - Not necessarily true, all you can really do is control checks and restart the server. More of an exaggeration than a lie, though still important.
- "Client detection, prevent a handful of the latest cracked clients before they even start to cheat" - If by this they mean cracked Vape V3, then sure, they detect that, though again, another exaggeration. There's no "latest cracked client" that they detect.
- "Prevent all sorts of crash methods before they even get the chance to affect your server" - It's amazing how they claim to patch crashers, yet there are crashers that exist by abusing their own anticrash.
- "Verus has the 3 main things an anticheat should have: Detectability, Scalability, and Reliability. These are 3 very basic concepts, yet other solutions on the market struggle with them, whereas Verus does not." - Verus doesn't have the detectability it claims to possess. Neither does it have the reliability it claims. Instead, it offers mediocre to low quality checks and dozens of false claims and exaggerations.
- "Regular is made to detect blatant cheats, Premium adds the capability to detect modern/ghost cheats." - Verus's ghost detections are mediocre at best and worth no more than $10. Sure they will detect bad/basic clients like vape. Any server running verus (whether it be latest, cracked, or old) is infested with closet cheaters running obvious settings.
- Verus's only support staff, Botings, stated that "verus has been doing non public updates", however, when confronted with evidence to the contrary (a screenshot of Jacob stating that Verus hadn't been touched in months), he completely ignored the message. Evidence: https://imgur.com/a/wcnh5jA
- Verus states that they're "Designed to run on the netty thread". This is a misleading claim, as any packet based AntiCheat automatically runs checks on the same thread that the packet is received from (netty threads). The implication from their claim is that Verus went out of their way to run checks on the netty thread for extra optimizations, and that this somehow puts them above other AntiCheats in terms of optimization.
- The owner of Verus stated that "There appears to be a small group of people spreading false information about Verus. Verus is being regularly updated and maintained". This is completely false. Jacob himself admitted privately to Aidan that he had not touched Verus in months a day before the latest release was pushed out. This might seem contradictive to what he said to Aidan, however when put into the context of what Aidan said (pushing him to update and calling verus a scam), as well as the fact that the update was almost exactly the same as the previous release (which occured months ago) with absolutely no noticeable changes made, it's evident that Jacob lied.

# To-Do
- Add KillAuraA
- Add KillAuraB
- Add KillAuraC
- Add KillAuraD
- Add KillAuraE
- Add KillAuraH
- Add KillAuraM
- Add KillAuraN
- (Normal KillAura checks) if anybody has pls add them

- Add AutoClickerI
- Add InventoryK
- (Premium checks)

# Verus Checks
- All verus checks I have found through testing. All of these checks are from Normal, Premium, Custom, and the recode
## AimAssist [1]
- A1 - Delta yaw
- C - Yaw consistency relative to pitch changes
- G - Rounded yaw
- H - Some weird value patch or something
## AutoClicker [2]
- A - Randomization (STD)
- B - Break blocks
- C - Reverse of B (checks for click consistentsy from attacking to breaking blocks)
- D - Randomization
- E - Weird breaking blocks check
- K - Randomization 
- X - CPS limit
- X2 - CPS limit 
## BadPackets [3]
- A - Packet limit
- B - Pitch limit
- B1 - Vehicle move limit
- C - NoSwing (attacking)
- D - Block order
- E - Entity action check
- F - Item use/release delay
- G1 - KeepAlive ping
- G3 - Transaction ping
- G4 - Teleport ping
- G5 - KeepAlive order
- G6 - Checks if recieved transactions
- G8 - Transaction order
- H - Rotation packet check
- I - Item spoof
- M - No slow; checks if sprinting while using an item
- O - Invalid block face
- P - Entity interact order
- R - Block interaction while sending player packets
- U - Item spoof
- V - Entity interact ID
- W - Placement packet limit
- X - Break speed
- Y - Blink 
- Z - NoSwing (breaking blocks)
## Fly [4]
- A - Collision fly
- A2- Jump collision fly
- A3 - Collision fly but some kind of location check idk
- B - Ground height
- C - Air y axis
- D - Air modification
- E - Low jump
- F - Upward motion
- G - High jump
- I - Air motion
- I2 - Air motion (shocker !)
- K - Ground spoof
- K2 - 
- L - Ground height
- L2 - 
- O - Strafe (realllly bad)
## Inventory [5]
- C - Inventory move
- F - Opening and closing inventory too fast 
- G - Interacting in intentory without being in inventory
- J - Sending swings while in inventory
## KillAura [6] 
- A - AimBot
- B - Clicker randomization
- C - AimBot
- D - AimBot
- E - AutoBlock; item use order
- F - AutoBlock; block dig order
- G - HitBox/rotations
- H - Post attacks
- H2 - Attacking while not sending player packets
- H3 - 
- K - AutoBlock; dropping items while attacking
- M - AutoBlock; placing blocks while attacking
- N - 
- O - MultiAura
- O2 - SwitchAura; switching between multiple players in 1 tick
- Q - AimBot
- Z - Rotation check not reliant on transactions
## PayLoad [7]
- A & B - Attempts to detect cracked clients on join
## Phase [8]
- Pretty sure these don't exist
## Reach [9]
- A - Attack range
- B - Entity interact range
- C - Attack range
- X - Attack range
## Speed [10]
- A - Movement speed limit
- B - Climb speed limit
- E - Sprinting in illegal directions
- X - Strafe
## Timer [11]
- A -
- A2 -
- B -
- B2 -
- B3 -
## Velocity [12]
- A - Vertical velocity
- B - Horizontal velocity
- C - AntiKB; checks to see if you move up after being hit
- D - Velocity motion 
## Misc [13]
- C - Some weird phase check
- F - Breaking blocks (no seriously lol)
- H - FastBreak
## Scaffold [14]
- A - 
- B - Post packets
- D - Duped item held packets
- E - Place xyz check 
- G - Placing blocks through blocks
## Crasher [15]

# Servers Using Verus
if you want to have some fun
- ghostly.live - cracked verus & cracked agc
- hazelmc.com - 2020 verus
- lunar.gg - cracked verus & cracked agc
- dynamicpvp.com - old verus
- onipvp.com - old verus
- holypvp.com - old verus
- astralmc.com - old verus
- universocraft.net - latest verus on a horrible cfg
- sagepvp.org - latest verus
- coldpvp.com - weird latest verus cfg
- vipermc.com - latest verus (i think)
- bwhub.net - cracked verus
- onlymc.us - old verus
- ecuacraft.gg - cracked verus
