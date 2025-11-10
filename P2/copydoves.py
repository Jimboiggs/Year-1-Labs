def copy_doves(columbid_species : list, dove_species : list) -> None:
    for i in range(len(columbid_species)):
        if columbid_species[i].endswith("Dove"):
            dove_species.append(columbid_species[i])
    return None

columbid_species = ["Rock Dove", "Stock Dove", "Wood Pigeon", "Turtle Dove", "Collared Dove"]
print(type(columbid_species[0]))