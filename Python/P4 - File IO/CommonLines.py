


def find_common() -> list[str]:
    commonArray = []
    array1 = []
    array2 = []
    fileName1 = input("File 1 name: ")
    fileName2 = input("File 2 name: ")
    file1 = open(fileName1, "r")
    file2 = open(fileName2, "r")

    for i in file1.readlines():
        array1.append(i)
    for j in file2.readlines():
        array2.append(j)
    
    for k in range (len(array1)):
        if array1[k] in array2:
            commonArray.append(array1[k])