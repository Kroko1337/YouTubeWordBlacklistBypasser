import clipboard


def reverse(arg: str):
    output = ""
    for x in range(1, len(arg) + 1):
        output += arg[len(arg) - x]
    return output


inputText = input("What do you want to write?\n")
bypassText = '\u202e' + reverse(inputText)
print(bypassText)
clipboard.copy(bypassText)
print("Copied the bypass text in clipboard!")
