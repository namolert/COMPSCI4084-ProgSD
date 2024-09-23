def display_name(firstname):
    if len(firstname) < 5:
        surname = str(input("Enter your surname: "))
        joined_name = firstname + surname
        print(f"Joined name in upper case is {joined_name.upper()}")
    else:
        print(f"Firstname in lower case is {firstname.lower()}")

firstname = str(input("Enter your firstname: "))
display_name(firstname)