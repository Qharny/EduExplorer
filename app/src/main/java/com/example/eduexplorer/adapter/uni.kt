class UniversityAdapter : RecyclerView.Adapter<UniversityAdapter.UniversityViewHolder>() {
    private var universities = listOf<University>()

    fun submitList(newList: List<University>) {
        universities = newList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UniversityViewHolder {
        val binding = ItemUniversityBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return UniversityViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UniversityViewHolder, position: Int) {
        holder.bind(universities[position])
    }

    override fun getItemCount() = universities.size

    class UniversityViewHolder(
        private val binding: ItemUniversityBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(university: University) {
            binding.apply {
                universityNameTv.text = university.name
                universityStateTv.text = university.stateProvince ?: "State not specified"
                universityWebsiteTv.text = university.webPages.firstOrNull() ?: "Website not available"
                
                // Make website clickable
                universityWebsiteTv.setOnClickListener {
                    university.webPages.firstOrNull()?.let { url ->
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                        itemView.context.startActivity(intent)
                    }
                }
            }
        }
    }
}