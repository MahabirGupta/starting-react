import "./App.css";

function App() {
  return (
    <div
      style={{
        margin: "auto",
        width: "800px",
        paddingTop: "1rem",
      }}
    >
      <h1 className="title">Pokemon Search</h1>
      {/* create table */}
      <table width="100%">
        <thead>
          <tr>
            <th>Name</th>
            <th>Type</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>Bulbasur</td>
            <td>Grass, Poison</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default App;
