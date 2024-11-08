import {useEffect, useState} from "react";

function StudentListFunc() {
    const [students, setStudents] = useState([
        {
            id: 1,
            name: "haiTT",
            address: "Quang Nam"
        },
        {
            id: 2,
            name: "haiTT2",
            address: "Quang Nam"
        },
        {
            id: 3,
            name: "haiTT3",
            address: "Quang Nam"
        }
    ])

    // useEffect(() => {
    // // nghiệp vụ call API
    //     console.log(1)
    // });
    return (
        <>
            <h1>Danh sach hoc sinh</h1>
            <table>
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                {
                    students.map((item) => (
                        <tr key={item.id}>
                            <td>{item.id}</td>
                            <td>{item.name}</td>
                            <td>{item.address}</td>
                            <td>{5 < 6 ? 5 : 6}</td>
                        </tr>
                    ))
                }
                </tbody>
            </table>
        </>
    )
}

export default StudentListFunc;