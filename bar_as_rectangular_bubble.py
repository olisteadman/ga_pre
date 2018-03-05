import matplotlib.pyplot as plt
import seaborn as sns
import random

fig, ax = plt.subplots(nrows=1, ncols=7, sharex=True, sharey=True, figsize=(14, 8))
# sns.set()

fig.text(0.5, 0.04, 'Number of people (represented by area of box)', ha='center')
fig.text(0.04, 0.5, 'Number of visits (1-10)', va='center', rotation='vertical')

days = ['Mon',
		'Tue',
		'Wed','Thu','Fri','Sat','Sun'
		]
m = 25

for day in days:
	results = range(10)
	data = []
	for result in results:
		a = random.choice(range(10))
		data.append([m-a,m,m+a])
	ax = plt.subplot(1,7,days.index(day)+1)
	medianprops = dict(linestyle=None, linewidth=0)
	plt.boxplot(data, notch=0,
				sym='',
				vert=0,
				whis=0,
				medianprops=medianprops,
				patch_artist=True,
				boxprops=dict(facecolor='blue', color='white'))
	plt.xlabel(day)
	ax.spines['right'].set_visible(False)
	ax.spines['top'].set_visible(False)
	ax.spines['bottom'].set_visible(False)
	ax.spines['left'].set_visible(False)
	ax.yaxis.set_ticks([0])
	ax.xaxis.set_ticks([0])
#	ax.yaxis.set_ticks([10,20,30,40])
	ax.xaxis.set_ticklabels('')
	plt.setp(ax.get_yticklabels(), visible=False)

plt.subplots_adjust(wspace=1)
plt.show()