import random

class Jokenpo:
	"""
		Class used asked two options to a user
		and decide with one won by a different 
		Rock, Paper and Scissors 
	"""
	def __init__(self):		
		self.occurrences = {
		'paper': ['lizard', 'scissors'],
		'rock': ['paper', 'spock',],
		'lizard': ['rock', 'scissors'],
		'spock': ['paper', 'lizard'],
		'scissor': ['rock', 'spock']
		}
		self.random_decision = None
		self.decision = None

	def get_choice(self):
		self.control_list = list()
		while True:
			for _, choice in enumerate(self.occurrences.keys()):
				print(f'\n\t[{_+1}] - {choice.capitalize()}')
				self.control_list.append(choice)
			try:
				decision = int(input('Choose: '))
			except (TypeError, ValueError):
				print('Wrong caracter, try again!')
				continue
			if decision in range(1,6):
				break
			else:
				print('Wrong choice, try again!')
		self.decision = decision

	def get_randomic_choice(self):
		if len(self.control_list) > 0:
			self.random_decision = random.randint(0,5)
		else:
			raise ValueError('The control list is empty!')

	def get_result(self):
		if self.random_decision and self.decision:
			if self.random_decision == self.decision:
				self.final = -1
			elif self.control_list[self.random_decision - 1] in self.occurrences[self.control_list[self.decision - 1]]:
				self.final = 1
			elif self.control_list[self.decision - 1] in self.occurrences[self.control_list[self.random_decision - 1]]:
				self.final = 0
		else:
			raise ValueError("The choices is empty!")
