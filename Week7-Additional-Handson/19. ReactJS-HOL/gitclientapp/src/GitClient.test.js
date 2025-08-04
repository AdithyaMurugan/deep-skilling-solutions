import axios from "axios";
import GitClient from "./GitClient";

jest.mock("axios");

describe("Git Client Tests", () => {
  test("should return repository names for techieSyed", async () => {
    const mockRepos = [{ name: "Repo1" }, { name: "Repo2" }];

    axios.get.mockResolvedValue({ data: mockRepos });

    const result = await GitClient.getRepositories("techieSyed");
    expect(result.data).toEqual(mockRepos);
    expect(axios.get).toHaveBeenCalledWith(
      "https://api.github.com/users/techieSyed/repos"
    );
  });
});
