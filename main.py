import clipboard


def reverse(arg: str):
    reversed
    for x in range(1, len(arg) + 1):
        reversed += arg[len(arg) - x]
    return reversed


inputText = input("What do you want to write?\n")
bypassText = '\u202e' + inputText
clipboard.copy(bypassText)
print("Copied the bypass text in clipboard!")
