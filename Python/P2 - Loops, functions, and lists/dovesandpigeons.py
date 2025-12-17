def extract_doves_and_pigeons(source : list[str], desination : list[str]) -> list:
    destination = []
    for i in range(len(source)):
        if (source[i].endswith("Dove")) or (source[i].endswith("Pigeon")):
            destination.append(source[i])
    return desination