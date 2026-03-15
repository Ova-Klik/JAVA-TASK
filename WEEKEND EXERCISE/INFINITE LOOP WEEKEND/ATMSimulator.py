def deposit(amount, balance):
    balance += amount
    print(f"\nDeposit of ₦{amount:,} Successful...")
    return balance


def withdraw(amount, balance):
    if amount > balance:
        print("\nInsufficient funds...\n")
    else:
        balance -= amount
        print(f"\nWithdrawal of ₦{amount:,} Successful...")
    return balance


def get_operation(option, balance):
    match option:
        case 1:
            amount = int(input("\nKindly enter amount to Deposit: ₦"))
            balance = deposit(amount, balance)

        case 2:
            amount = int(input("\nKindly enter amount to Withdraw: ₦"))
            balance = withdraw(amount, balance)

        case 3:
            print(f"\nBalance: ₦{balance:,}")

        case _:
            print("\nInvalid input\n")

    return balance


def main():
    balance = 1000

    while True:
        print("""
                --ATM Simulation System--

                1. Deposit Money
                2. Withdraw Money
                3. Check Balance
                0. Exit
        """)

        option = input("Enter operation (0-3): ")

        if option.isdigit() and option in {"0", "1", "2", "3"}:
            option = int(option)

            if option == 0:
                print("\nThank you for banking with us...\n")
                break

            balance = get_operation(option, balance)

        else:
            print("\nInvalid input\n")


main()
