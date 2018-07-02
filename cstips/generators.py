import resource
import random
import time

names = ['John', 'Corey', 'Adam', 'Steve', 'Rick', 'Thomas']
majors = ['Math', 'Engineering', 'CompSci', 'Arts', 'Business']

print('Memory (before): {}Mb'.format(resource.getrusage(resource.RUSAGE_SELF).ru_maxrss))

def people_list(num_people):
    results = []
    for i in range(num_people):
        person = {
            'id': i,
            'name': random.choice(names),
            'major': random.choice(majors)
        }
        results.append(person)
    return results

def people_generator(num_people):
    for i in range(num_people):
        person = {
            'id': i,
            'name': random.choice(names),
            'major': random.choice(majors)
        }
        yield person

t1 = time.clock()

# # EITHER
# people = people_list(1000000)      
# 9957376Mb to 287043584Mb ... took 1.9965410000000001 seconds

# # OR
people = people_generator(1000000)
# 10076160Mb to 10088448Mb ... took 2.000000000002e-06 seconds

t2 = time.clock()

print('Memory (after): {}Mb'.format(resource.getrusage(resource.RUSAGE_SELF).ru_maxrss))
print('Took {} seconds'.format(t2-t1))