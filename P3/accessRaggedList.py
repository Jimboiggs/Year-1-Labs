def access_element(ragged_list, i, j):
    if ragged_list is None:
        return (3, None)
    elif i < 0 or i >= len(ragged_list):
        return (1, None)
    elif j < 0 or j >= len(ragged_list[i]):
        return (2, None)
    else:
        return (0, ragged_list[i][j])
