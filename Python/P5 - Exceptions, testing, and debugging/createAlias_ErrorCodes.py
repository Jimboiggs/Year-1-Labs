def create_alias() -> (int, str):
    alias = input("Enter alias: ")
    code = 0
    if alias == "":
        print("An alias cannot be the empty string")
        code += 1
    elif ord(alias[0]) > 47 and ord(alias[0]) < 58:
        print("An alias cannot start with a digit")
        code += 2
    if len(alias) > 8:
        print("An alias cannot be longer than 8 characters")
        code += 4
    if " " in alias:
        print("An alias cannot contain spaces")
        code += 8

    if code == 0:
        return (code, alias)
    else:
        return (code, "")

