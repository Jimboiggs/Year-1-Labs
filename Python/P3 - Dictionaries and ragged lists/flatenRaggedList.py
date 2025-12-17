def flatten_ragged_list(ragged_list : list[list]):
    newList = []
    for i in range (len(ragged_list)):
        subList = ragged_list[i]
        for j in range (len(subList)):
            newList.append(subList[j])
    return newList

def calculate_statistics (ragged_list):
    newList = flatten_ragged_list(ragged_list)
    
    length = len(newList)
    sum = 0
    for i in range (length):
        sum += newList[i]
    average = sum / length

    return (length, average, max(newList), sum)
