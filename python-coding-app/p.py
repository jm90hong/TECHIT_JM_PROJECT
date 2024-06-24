def main():
    # 음료 목록과 가격
    drinks = ["Coke", "Pepsi", "Water"]
    prices = [1500, 1400, 1000]
    
    print("자판기 가동 시작")
    print("주문 가능한 음료들:")
    
    # 음료 목록 출력
    for i in range(len(drinks)):
        print(f"{i + 1}. {drinks[i]} - {prices[i]} 원")
    
    # 음료 선택
    choice = int(input(f"음료수를 선택하세요. (1~{len(drinks)}): "))
    
    # 선택 유효성 검사 (1보다 작거나 음료수 개수보다 크면 종료)
    if choice < 1 or choice > len(drinks):
        print("잘못된 요청 입니다.")
        return
    
    price = prices[choice - 1]
    print(f"선택한 음료 {drinks[choice - 1]}. 가격: {price} 원.")
    
    # 돈 입력
    money = int(input("돈을 넣어주세요: "))
    
    # 돈 유효성 검사 및 결과 출력
    if money < price:
        print("돈이 부족합니다.")
    else:
        change = money - price
        print("구매를 해주셔서 감사합니다.")
        print(f"남은돈 : {change} 원.")

if __name__ == "__main__":
    main()
