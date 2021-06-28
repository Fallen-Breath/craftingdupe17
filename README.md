# Crafting Dupe 17

Crafting item duping helper for Minecraft 1.17.x

It's a client side only mod, requires fabric loader only

## How to use

Places some items (>=3 item per stack) in any crafting input slots (crafting table / player inventory)

Make sure the patten is not craft-able, in other words, the output slot should be empty

Press `drop item` key (default `Q`) in the output slot, then you can <3 mojang

![simple showcase](simple_showcase.gif)

| Item count | Result |
| ---------- | ------ |
| 1          | Item disappears |
| 2          | Item remains |
| >=3        | Item dupes |

Guess:

![Guess](https://latex.codecogs.com/svg.latex?NewItemCount%20=%20(OldItemCount%20-%201)%20*%202)

## What it does

In vanilla empty slot doesn't respond to `drop item` key or `clone item` key at all

What it does is only enabling `drop item` or `clone item` key on crafting input/output slot, even if the input/output slot is empty

## In vanilla

Technically you are able to somehow create a temporary ghost item stack in the crafting output slot by network lag, so you can execute the `drop item` key in vanilla
