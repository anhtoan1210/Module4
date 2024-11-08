import {useEffect, useState} from "react";

function DemoStateFunc() {
    const [num, setNum] = useState(0);
    const [students, setStudents] = useState([])

    useEffect(() => {
        // nghiệp vụ call API
        console.log(1)
    }, []);

    useEffect(() => {
        return () => {
            // willUnMount
        }
    }, [])

    const incrementNum = () => {
        setNum((prevState) => prevState + 1);
        // setNum((prevState) => prevState + 1);
        // setNum((prevState) => prevState + 1);
    }

    return (
        <>
            <h1>{num}</h1>
            <button onClick={incrementNum}>Click</button>
        </>
    )
}

export default DemoStateFunc;