// Data class for University
data class University(
    val name: String,
    val country: String,
    @SerializedName("state-province")
    val stateProvince: String?,
    @SerializedName("alpha_two_code")
    val alphaTwoCode: String,
    val domains: List<String>,
    @SerializedName("web_pages")
    val webPages: List<String>
)

// API Service Interface
interface UniversityApiService {
    @GET("search")
    suspend fun getUniversities(
        @Query("country") country: String
    ): List<University>
}

// Repository class
class UniversityRepository(private val apiService: UniversityApiService) {
    suspend fun getUniversities(country: String): List<University> {
        return apiService.getUniversities(country)
    }
}

// ViewModel
class UniversityViewModel : ViewModel() {
    private val _universities = MutableLiveData<List<University>>()
    val universities: LiveData<List<University>> = _universities
    
    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading
    
    private val _error = MutableLiveData<String>()
    val error: LiveData<String> = _error
    
    fun fetchUniversities(country: String) {
        viewModelScope.launch {
            _isLoading.value = true
            try {
                val result = repository.getUniversities(country)
                _universities.value = result
                _error.value = null
            } catch (e: Exception) {
                _error.value = e.message
            } finally {
                _isLoading.value = false
            }
        }
    }
}