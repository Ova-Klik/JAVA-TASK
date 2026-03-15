def check_prime_number(number):
    divisor = 2
    input_is_prime = True

    while divisor < number:
        if number % divisor == 0:
            input_is_prime = False
            break
        divisor += 1

    return input_is_prime


def get_prime_numbers(number):
    input_is_prime = check_prime_number(number)

    if input_is_prime:
        print(f"{number} is a prime number\n")
        print(f"Prime numbers from 1 to {number}:")

        for check in range(2, number + 1):
            if check_prime_number(check):
                print(check, end=" ")

        print()

    else:
        print(f"{number} is not a prime number\n")



number = int(input("Enter a Number: "))
get_prime_numbers(number)



