import csv

def calculate_running_total(source: str, destination: str, column: Optional[str] = None) -> int:
    sourceFile = open(source, "r")
    destinationFile = open(destination, "a")
    reader = csv.reader(sourceFile)
    writer = csv.writer(destinationFile)
    count = 0
    data = []
    next(reader, None)
    data.append("Running Total")
    for row in reader:
        count += int(row[1])
        row.append(str(count))
        data.append(row)
        writer.writerows(data)
    sourceFile.close()
    destinationFile.close()
    return count

