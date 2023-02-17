from libs.paper_scissors_class import Jokenpo


def main():
	keep = 'y'
	while keep != 'n':
		print('\n', 10 * ' - ', "Welcome to Attenuare's different papers and scissors", 10 * ' - ')
		object_ = Jokenpo()
		object_.get_choice()
		object_.get_randomic_choice()
		object_.get_result()
		results = f'{object_.control_list[object_.decision - 1].capitalize()} and I choose {object_.control_list[object_.random_decision - 1].capitalize()}'
		if object_.final == -1:
			print(f'There was a Draw! you choose {results}!')
		if object_.final == 1:
			print(f'You won, you choose {results}!')
		if object_.final == 0:
			print(f'You lost, you choose {results}!')
		while True:
			try:
				keep = str(input('\nKeep playing? [Y] or [N]\nChoose: ')).lower()
			except (TypeError, ValueError):
				print('Wrong choice, try again!')
				continue
			if keep == 'y' or keep == 'n':
				break
	print('Thanks for playing!')

if __name__ == '__main__':
	main()
