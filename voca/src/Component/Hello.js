import { useState } from "react";
import World from "./World";

export default function(){

    const [name, setName] = useState('mike'); 
    /*  useState 배열을 반환
    첫반째는  state  변수명. state를 변경해 주는 함수 
    배열 구조분해 형식 사용 [,]
    useState(초기값 설정)
    
    */
    function changeName(){
        const newName = name === 'mike' ? 'jane' :'mike';
        setName(newName)
        console.log(name);
    }


    
    return (

        <>
        <div>
            
            <h1 style={
                {
                    color:"#f00",
                    borderRight:"12px solid blue",
                }
            } > 
                hello
                
            </h1>
        

           <button id="name" onClick={changeName}>changeName+{name}</button> 
        </div>
        </>
    )
}





