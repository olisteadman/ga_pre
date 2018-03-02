import matplotlib.pyplot as plt
import random

fig, ax = plt.subplots(nrows=3, ncols=3, sharex=True, sharey=True, figsize=(14, 8))

fig.text(0.5, 0.04, 'number of people', ha='center')
fig.text(0.04, 0.5, 'number of visits', va='center', rotation='vertical')

days = ['Mon','Tue','Wed','Thu','Fri','Sat','Sun']
    
for day in days:
    plt.subplot(1,7,days.index(day)+1)
    plt.barh(range(36),random.sample(range(1, 100), 36))
    plt.xlabel(day)
    
plt.subplots_adjust(wspace=1)
plt.show()
