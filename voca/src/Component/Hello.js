import { useState } from "react";
import UserName from "./UserName";
import World from "./World";

export default function Hello(props){
    /*props == {age} */

    console.log(props);

    const [name, setName] = useState('mike'); 
    const [age, setAge] = useState(props.age); 
    const  msg = age > 30 ? '111' :'123'; 
    /*  useState 배열을 반환
    첫반째는  state  변수명. state를 변경해 주는 함수 
    배열 구조분해 형식 사용 [,]
    useState(초기값 설정)
    
    */
    function changeName(){
        const newName = name === 'mike' ? 'jane' :'mike';
        const newAge = age;
        setName(newName);
        setAge(age+1)
        console.log(name);
    }

    return (
        <>
        <div>
            <h1> hello</h1>
            <UserName  name={name}/>

           <button id="name" onClick={changeName}>changeName+{name}+{age}{msg}</button> 
        </div>
        </>
    )
}





