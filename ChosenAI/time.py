# original code:
# import json
# import csv
# import datetime
# import time

# def func(var1,var2,var3,var4):
#     dictionary = {}
#     for value in var4:
#         dictionary[value['n']] = time.mktime(time.strptime(value['b'],var2))
#         with open(var1, 'w') as var5:
#              json.dump(dictionary, var5)

# func('blah.txt', '%d %b %y', [
# {
# "n": 'John Doe',
# 'b':'30 Nov 98'
# },{’n': 'Josh Doe', 'b':'12 Apr 86'}])

# INTENTION OF THE CODE:
# - trying to find the difference between user DoB and starting date `01/01/1970 00:00:00`, by
# - reading users' details from a python list of dicts,
# - using `strptime` to convert date string to date value in seconds,
# - and converting reformatted dict to jso to updata a text file.

# ISSUES WITH THE CODE:
# - `func()` could be improved by using more descriptive arg names
# - `func()` is missing 1 required positional argument: either `var3` or `var4`
# - json.dump is indented by 5 rather than 4 spaces, relative to the previous line
# - in final line (applying the function to some user data) there's an accent \` instead of a quote '.

# refactored version:
import json
import csv
import datetime
import time


def func(txt_file, date_format, users_list):
    dictionary = {}
    for value in users_list:
        dictionary[value['n']] = time.mktime(
            time.strptime(value['b'], date_format))
        with open(txt_file, 'w') as rec_update:
            json.dump(dictionary, rec_update)


func('blah.txt', '%d %b %y',
     [
         {"n": 'John Doe', 'b': '30 Nov 98'},
         {'n': 'Josh Doe', 'b': '12 Apr 86'}],
     )