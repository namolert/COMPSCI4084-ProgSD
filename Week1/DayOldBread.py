REGULAR_PRICE = 3.49
DISCOUNT_PER = 0.60

def cal_price(num_dayold):
    print(f"Regular bread price: {REGULAR_PRICE:.2f} £")
    print(f"Day old bread discount: {DISCOUNT_PER * 100:.2f} %")

    total_dayold_price = num_dayold * (REGULAR_PRICE * (1 - DISCOUNT_PER))
    print(f"Total price: {total_dayold_price:.2f} £")

num_dayold = float(input("Enter the number of loaves of day old bread: "))
if num_dayold < 0:
    print("Incorrect number!")
else:
    cal_price(num_dayold)