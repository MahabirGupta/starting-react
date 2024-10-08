import "./App.css";
import pokemon from "./pokemon.json";
// /Users/mahabirguptanew/Library/Mobile Documents/com~apple~CloudDocs/Documents/React TypeScript/react-typescript-demo/starting-react/pokemon.json

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
          {pokemon.slice(0, 20).map((pokemon) => (
            <tr key={pokemon.id}>
              <td>{pokemon.name.english}</td>
              <td>{pokemon.type.join(",")}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;
