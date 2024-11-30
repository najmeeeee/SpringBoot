import { useEffect, useState } from "react";
import axios from "axios";
import "./Dashboard.css";

function Dashboard() {
  const [addresses, setAddresses] = useState([]);
  const [name, setName] = useState("");
  const [phoneno, setPhoneno] = useState("");
  const [email, setEmail] = useState("");
  const [address, setAddress] = useState("");

  useEffect(() => {
    fetchAddresses();
  }, []);

  function fetchAddresses() {
    axios.get("http://localhost:8080/api/address").then((res) => {
      setAddresses(res.data);
    });
  }

  function addAddress() {
    const addressData = {
      name: name,
      phoneno: phoneno,
      email: email,
      address: address,
    };

    axios.post("http://localhost:8080/api/address", addressData).then((res) => {
      setAddresses([...addresses, res.data]);
      setName("");
      setPhoneno("");
      setEmail("");
      setAddress("");
    });
  }

  return (
    <div className="dashboard-container">
      <div className="form-container">
        <h2>Add Address</h2>
        <div className="form">
          <input
            type="text"
            placeholder="Enter name"
            value={name}
            onChange={(e) => setName(e.target.value)}
          />
          <input
            type="text"
            placeholder="Enter phone number"
            value={phoneno}
            onChange={(e) => setPhoneno(e.target.value)}
          />
          <input
            type="email"
            placeholder="Enter email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
          <input
            type="text"
            placeholder="Enter address"
            value={address}
            onChange={(e) => setAddress(e.target.value)}
          />
          <button onClick={addAddress}>Add Address</button>
        </div>
      </div>

      <div className="address-details-container">
        <h2>Address Details</h2>
        <div className="address-list">
          {addresses.map((address) => (
            <div key={address.id} className="address-item">
              <p><strong>ID:</strong> {address.id}</p>
              <h3><strong>Name:</strong> {address.name}</h3>
              <p><strong>Phone No:</strong> {address.phoneno}</p>
              <p><strong>Email:</strong> {address.email}</p>
              <p><strong>Address:</strong> {address.address}</p>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
}

export default Dashboard;
