class nodes(object):
	"""general nodes"""

	def __init__(self, threshold):
		self.activation = 0
		self.threshold = threshold
		self.links = []
		self.weights = []

	def addLink(self, link, weight):
		self.links.append(link)
		self.weights.append(weight)

	def addActivation(self, potential):
		self.activation = self.activation + potential

	def resetActivation(self):
		self.activation = 0

	def propagate(self):
		for node, weight in zip(self.links, self.weights):
			node.addActivation(weight)

	def thresholdCheck(self):
		if self.activation >= self.threshold:
			self.resetActivation()
			self.propagate()