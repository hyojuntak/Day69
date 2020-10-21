//파이썬
a = int(input())#입력 받기
count = 0 #연산 수행할 count 변수 초기화
minimum=[a]   #최솟값을 입력받은 수로 한정 

def cal(a):   #재귀 함수 cal 선언
    list = []   #담을 리스트 선언 
    for i in a:   #입력받은 수만큼 돌리기
        list.append(i-1)  #뺄샘 수행
        if i%5 == 0:      #후 /5나누기 수행  
            list.append(i/5)  #나눠지면 list에 몫을 저장
        if i%3 == 0:          #3나누기 수행
            list.append(i/3)  #나눠지면 list에 몫을 저장
        if i%2 == 0:          #2나누기 수행   
            list.append(i/2)  #나눠지면 list에 몫을 저장
    return list               #list return 하기 
 
while True:
    if a == 1:                  #a가 1이라면
        print(count)            #count 출력후
        break                   #while문 탈출         
    temp = minimum[:]           #temp 에 minimum 전체 담기
    minimum = []                #minimum 초기화
    minimum = cal(temp)         #minimum에 재귀함수 호출
    count +=1                   #count +1 하기        
    if min(minimum) == 1:       #만약 minnum의 최솟값이 1이라면         
        print(count)            #카운트출력
        break                   #후 while문 탈출 


    
    
    
