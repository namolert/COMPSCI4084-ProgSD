fav1, fav2, fav3, fav4 = str(input("Enter your favorite food: ")).split()
fav_dict = {1: fav1, 2: fav2, 3: fav3, 4: fav4}
for key in fav_dict:
    print(key, fav_dict[key])

keyr, valr = str(input("Which key-value you want to remove?: ")).split()
fav_dict.pop(int(keyr))

for key in fav_dict:
    print(key, fav_dict[key])