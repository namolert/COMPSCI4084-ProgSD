COUNTRIES = ['England', 'Scotland', 'China', 'India', 'Thailand']
print(COUNTRIES)

user_input = str(input("Enter one country from the list: "))
print(f"The index of this country is {COUNTRIES.index(user_input)}")

user_index = int(input("Enter index of one country from the list: "))
print(f"The country is {COUNTRIES[user_index]}")