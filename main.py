import copy

import clipboard
import pip
import pkg_resources

from pkg_resources import DistributionNotFound, VersionConflict

dependencies = [
    "Clipboard>=0.0.4"
]


def reverse(arg: str):
    reversed
    for x in range(1, len(arg) + 1):
        reversed += arg[len(arg) - x]
    return reversed


try:
    pkg_resources.require(dependencies)
except (VersionConflict, DistributionNotFound):
    for dependency in dependencies:
        split = dependency.split(">=")
        pip.main(["install", split[0] + "==" + split[1]])
        print("Install", split[0], "(" + split[1] + ")")
inputText = input("What do you want to write?\n")
bypassText = '\u202e' + inputText
clipboard.copy(bypassText)
print("Copied the bypass text in clipboard!")
