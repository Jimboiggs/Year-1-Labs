import random
room_items = ["bow", "armour", "boomerang", "shield", "sword"]
player_items = []

def treasure_room():
    print("You have found the ultimate treasure chest! You win the game!")

def item_room(room_items):
    newItem = room_items.pop(random.randint(1, (len(room_items) - 1)))
    player_items.append(newItem)
    print("You found " + newItem + "you decide to pick it up!")