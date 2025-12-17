def uniq (source: str, destination: str) -> int:
    sourceFile = open(source, "r")
    destinationFile = open(destination, "a")
    temp = ""
    count = 0
    for line in source:
        if temp != line:
            destinationFile.write(line)
            count+=1
        temp = line
    sourceFile.close()
    destinationFile.close()
    return count

source = "C:\Users\james\Documents\University\Year 1\Labs\P4\events.txt"
destination = "events_uniq_output.txt"
result = uniq(source, destination)
print(result)
