import resource
import json
import time


print('Memory (before): {}Mb'.format(resource.getrusage(resource.RUSAGE_SELF).ru_maxrss))

def funcL(txt_old, date_format, users_list):
    dictionary = {}
    for value in users_list:
        dictionary[value['n']] = time.mktime(
            time.strptime(value['b'], date_format))
    with open(txt_old, 'w') as txt_new:
        json.dump(dictionary, txt_new)


def funcG(txt_old, date_format, users_list):
    for user in users_list:
        user = {
                'name':users_list[user]['n'],
                'time':time.mktime(time.strptime(users_list[user]['b'], date_format))
               }
        print(person)
        yield person



t1 = time.clock()

funcL('blah.txt', '%d %b %y',
     [
         {"n": 'John Doe', 'b': '30 Nov 98'},
         {'n': 'Josh Doe', 'b': '12 Apr 86'}],
     )

t2 = time.clock()

print('Memory (after): {}Mb'.format(resource.getrusage(resource.RUSAGE_SELF).ru_maxrss))
print('Took {} seconds'.format(t2-t1))