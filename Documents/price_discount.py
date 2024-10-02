


def my_discount(price, discount):
   
    if discount < 0 or discount > 100:
        raise ValError("Discount must be between 0 and 100")

    discount_amount = (discount / 100) * price
    price_after_discount = price - discount_amount
    return price_after_discount


def main():

	price = float(input("enter oriiginal price: "))
	price = float(input("enter discount: "))


	print(f"Price after discount: ${my_discount(price, discount):.2f}")

	print(f"Original Price: ${price}")
	print(f"Discount: {discount}%")



# Example usage:
# price = 150
# discount = 15
# print(f"Original Price: ${price}")
#print(f"Discount: {discount}%")




