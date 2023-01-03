/**
 * 
 */

function proc1(){
	
	let today = new Date();
	var day1 = today.toLocaleString();
	var day2 = today.toLocaleDateString();
	var day3 = today.toLocaleTimeString();
	
	
	//	let은 중복선언이 안된다 (함수범위)
	//	var는 중복선언이 가능한대 마지막에 선언한 변수만 사용 가능	(블록범위)
	//	

	// id=result인 요소를 검색
	var vres = document.getElementById('result');
	
	var str = today + "<br>";
	str += day1 + "<br>";
	str += day2 + "<br>";
	str += day3 + "<br>";
	
	//출력
	vres.innerHTML = str;
	
	var sum = 0;
	for(let i = 0; i<=10; i++){
		sum += i;
	}
	
	alert(i + ", " + sum);
	
	const A = "123";
	
	alert(A)
	
//	const A= 123이라는 문자로 고정 상수를 선언할때(변하지 않는 값을 설정할때 상수 const를 사용한다)

}





/**
 * 
 */

