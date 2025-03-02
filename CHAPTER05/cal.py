import networkx as nx # type: ignore
import matplotlib.pyplot as plt # type: ignore

# Define the sets and relation S
nodes_B = ['a', 'b', 'c']
relation_S = [('a', 'b'), ('b', 'b'), ('a', 'c'), ('b', 'c')]

# Create a directed graph
G = nx.DiGraph()

# Add nodes and edges for relation S
G.add_nodes_from(nodes_B)
G.add_edges_from(relation_S)

# Draw the graph
plt.figure(figsize=(8, 6))
pos = nx.spring_layout(G, seed=42)  # Layout for better visualization
nx.draw(
    G, pos, with_labels=True, node_color='skyblue',
    node_size=2000, font_size=14, font_weight='bold',
    edge_color='gray', arrowsize=20
)

plt.title("Graph Representation of Relation S", fontsize=16)
plt.show()
