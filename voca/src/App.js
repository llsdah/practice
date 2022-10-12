import logo from './logo.svg';
import './App.css';
import Hello from './Component/Hello';
import Wellcome from './Component/Wellcome';



function App() {
  return (
    <div className="App">
      <Hello age={10}/>
      <Hello age={20}/>
      <Hello age={30}/>
      <Wellcome />      
    </div>
  );
}

export default App;
