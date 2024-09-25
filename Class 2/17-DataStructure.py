ppl1, ppl2, ppl3 = str(input("Enter three name: ")).split()
ppl_list = [ppl1, ppl2, ppl3]
while True:
    is_wanted = str(input("Add another?: "))
    if is_wanted == "yes":
        ppl = str(input("Enter the name: "))
        ppl_list.append(ppl)
    elif is_wanted == "no":
        print(f"{len(ppl_list)} people have invited to the party")
        break
    else:
        print("Please answer with \"yes\" or \"no\" only")
